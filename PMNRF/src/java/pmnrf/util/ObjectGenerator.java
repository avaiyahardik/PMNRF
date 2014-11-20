/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pmnrf.util;

/**
 *
 * @author Shidhav
 */
public class ObjectGenerator {
    
    public static Object createObject(String className){
        //System.out.println("object okk");
        Object obj=null;
        try{
            if(className==null){
                return null;
            }
            Class name=Class.forName(className);
            //System.out.println("object okk");
            obj=name.newInstance();
            
        }catch(Exception e){
            System.out.println("Err: "+e.toString());
            return null;
        }
        return obj;
    }
    
}
