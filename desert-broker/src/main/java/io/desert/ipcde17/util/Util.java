package io.desert.ipcde17.util;

import java.util.Random;

import org.bson.types.ObjectId;

public class Util {

    public static ObjectId buildRandomObjectId() {
        return new ObjectId(buildRandomHexString(24));
    }

    public static String buildRandomHexString(int numchars) {
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        
        while(sb.length() < numchars){
            sb.append(Integer.toHexString(r.nextInt()));
        }

        return sb.toString().substring(0, numchars);
    }
    public static int buildRandomInt32() {
        return (new Random()).nextInt();
    }
}
