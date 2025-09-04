import java.util.*;
class route{
    
    public static float displacement(String str){
        int x=0;
        int y=0;
        for( int i=0 ; i<str.length() ; i++){
            char curr_dir = str.charAt(i);

            if(curr_dir=='N'){
                y++;
            }else if(curr_dir=='S'){
                y--;
            }else if(curr_dir=='E'){
                x++;
            }else{
                x--;
            }

        }
        int x2 = (x*x);
        int y2 = (y*y);
        
        float result = (float)Math.sqrt(x2+y2);

        return result;
    }
    
    
    public static void main(String args[]){
        String map = "WNEENESENNNWNS";
        System.out.println(displacement(map));
    }
}