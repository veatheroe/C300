package oe.stu.march;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author： oe
 * @Description:
 * @Created by oe on 2018/3/12.
 */
public final class MMSCRouter {
    private static volatile MMSCRouter instance = new MMSCRouter();
    private final Map<String, MMSCInfo> routeMap;
    public MMSCRouter(){
        this.routeMap = MMSCRouter.retriveRouteMapFromDB();
    }
    private static Map<String, MMSCInfo> retriveRouteMapFromDB(){
        Map<String, MMSCInfo> map = new HashMap<String, MMSCInfo>();
        return map;
    }
    public static MMSCRouter getInstance(){
        return instance;
    }
    public MMSCInfo getMMSC(String msisdnPrefix) {
        return routeMap.get(msisdnPrefix);
    }
    public static void setInstance(MMSCRouter newInstance){
        instance = newInstance;
    }
    private static Map<String, MMSCInfo> deepCopy(Map<String, MMSCInfo> m){
        Map<String, MMSCInfo> result = new  HashMap<String, MMSCInfo>();
        for(String key : m.keySet()){
            result.put(key, new MMSCInfo(m.get(key)));
        }
        return result;
    }
    public  Map<String, MMSCInfo> getRouteMap(){
        return Collections.unmodifiableMap(deepCopy(routeMap));
    }

    public class OMCAgent extends Thread{
        @Override
        public void run(){
            boolean isTableModificationMsg = false;
            String updatedTableName = null;
            while(true){
                if(isTableModificationMsg)
                    if("MMSCInfo".equals(updatedTableName))
                        MMSCRouter.setInstance(new MMSCRouter());
            }
        }
    }
}
