
package in.ezeon.springcontactapp.util;
//this method user mutiple value to comaseprat heare
//this class contains utility method related to string op.
 class StringUtil {
    public  static String toCommaSeparatedString(Object[] items){
        StringBuilder sb = new StringBuilder();
        for (Object item : items) {
            sb.append(item).append(",");
        }
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
    
    
}
