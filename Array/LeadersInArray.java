import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> leads = new ArrayList<Integer>();

        int max = arr[n-1];
        leads.add(arr[n-1]);
        for(int i = n-2 ; i>=0 ; i--) {
            if(arr[i]>=max) {
                max = arr[i];
                leads.add(max);
            }
        }
        Collections.reverse(leads);
        return leads;
    }

}
