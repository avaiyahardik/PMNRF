/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.util;

import DAO.DBManager;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Sender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.simple.JSONObject;
import pmnrf.model.Disaster;

/**
 *
 * @author Shidhav
 */
public class Utilities {

    private static final long serialVersionUID = 1L;
    // Put your Google API Server Key here
    private static final String GOOGLE_SERVER_KEY = "AIzaSyCAZTZnEGmQ2rqj_NU0q7d-FoR0-vwAHRA";
    static final String MESSAGE_KEY = "action";
    static final String REG_ID_STORE = "GCMRegId.txt";

    public void sentNotification() {
        MulticastResult result = null;

        try {

            DBManager dbm=new DBManager();
            int id=dbm.getLastDisasterId();
            
            Disaster d=dbm.getDisaster(id);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", id);
            jSONObject.put("name", d.getDisasterName());
            jSONObject.put("type", d.getType());
            jSONObject.put("date", d.getDateOfOccurence());
            jSONObject.put("description", d.getDescription());
            jSONObject.put("city", d.getCity());
            jSONObject.put("state", d.getState());

            String json = jSONObject.toJSONString();
            jSONObject = new JSONObject();
            jSONObject.put("insert_disaster", json);

            Sender sender = new Sender(GOOGLE_SERVER_KEY);

            Message message = new Message.Builder().addData(MESSAGE_KEY, jSONObject.toJSONString()).build();
            System.out.println("Message: " + message);
            Set regIdSet = readFromFile();
            System.out.println("regId: " + regIdSet);
            List regIdList = new ArrayList();
            regIdList.addAll(regIdSet);
            result = sender.send(message, regIdList, 1);
        } catch (IOException ioe) {
            ioe.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
      private Set readFromFile() throws IOException {
        //  BufferedReader br = new BufferedReader(new FileReader(REG_ID_STORE));
          
          //return set thatew 
          
          try{
              DBManager dbm=new DBManager();
              Set set=dbm.getAllGCMUser();
              return set;
          }catch(Exception e){
              return null;
          }
          
        /*String regId = "APA91bGk1_jOWQ33Ex16M7f9i_pkOKsbetmo5Q7AT32ELmugXksbKd7JTmr2G97BAPvBRIjUMOKjyq5hpBsnZhg-NZUhYL1bwVKeBF3obvhXmyoRIdQXb10Oe9bFb_EoL-Zm5fnmrhrlhIRVMGobkAXOCix6OG6cYw";
        Set regIdSet = new HashSet();
        regIdSet.add(regId);
        regId = "APA91bHxsb_f54FRY7bB9zvy0XcRKi9HS2XtQniT5ngkKMSEDM09Q2kbOWOpoOVu848mhbuWmzWUqmRcvR6BDZxfjy2CFzvHc-wKsd12g0Nt5jK9WSLMQqzIvvbhJqNLIdetDFgM0TFThERqNM-muUMnJctoqkW5BA";
        regIdSet.add(regId);
        return regIdSet;*/
    }

}
