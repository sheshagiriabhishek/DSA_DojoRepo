class Solution {
    public int numRescueBoats(int[] people, int limit) {

        int light = 0, heavy  = people.length-1;
        int boats = 0;
        Arrays.sort(people);
        while(light<=heavy){

            if(light==heavy) {
                boats++;
                break;
            }

            if (people[light]+people[heavy]<=limit)
            {
                light++;
                heavy--;
            }

            else
                heavy --;

            boats++;
             
        }


        return boats;
        
        
        
    }
}


//light, heavy pointer start from left and right ends resp
//till light<=heavy
//  if(light==heavy) 
//      boat++;
//      break;
//  if people[light]+people[heavy]<=limit
//      light++;
//      heavy--;
//  else
//      heavy --;
//  boat++;


