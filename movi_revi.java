package newpro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class movi_revi {
        public static HashMap<Integer, ArrayList<Float>> filesread() throws FileNotFoundException {
            Scanner sc2 = new Scanner(new File("C:\\Users\\LVS\\IdeaProjects\\Movie_Reviews\\src\\com\\company\\ratings.csv"));
            HashMap<Integer, ArrayList<Float>> h = new HashMap<Integer, ArrayList<Float>>();
            HashMap<Integer, String> movnames = new HashMap<>();
            while (sc2.hasNext()) {
                String[] a = sc2.next().split(",");
                //System.out.println(a[1]+" "+a[2]);
                int n = Integer.parseInt(a[1]);
                float m = Float.parseFloat(a[2]);
                //num.add(n);
                if (!h.containsKey(n)) {
                    ArrayList<Float> f = new ArrayList<>();
                    f.add(m);
                    h.put(n, f);
                } else {
                    ArrayList<Float> f = new ArrayList<>();
                    f = h.get(n);
                    f.add(m);
                    h.put(n, f);
                }
            }
            return h;
        }
        public static float minimum(HashMap<Integer,ArrayList<Float>> h,int i) {
            // for (Integer i : h.keySet()) {
            ArrayList<Float> f = h.get(i);
            if (f.size() > 4) {
                float min = 6;
                for (int j = 0; j < f.size(); j++) {
                    if (f.get(j) < min)
                        min = f.get(j);

                }
                return min;
            }
            else
                return -1;
        }
        public static float maximum(HashMap<Integer,ArrayList<Float>> h,int i) {
            // for (Integer i : h.keySet()) {
            ArrayList<Float> f = h.get(i);
            if (f.size() > 4) {
                float max = 0;
                for (int j = 0; j < f.size(); j++) {
                    if (f.get(j) >max)
                        max = f.get(j);

                }
                return max;
            } else
                return -1;
        }

        public static float average(HashMap<Integer,ArrayList<Float>> h,int i) {
            // for (Integer i : h.keySet()) {
            ArrayList<Float> f = h.get(i);
            if (f.size() > 4) {
                float avg = 0;
                for (int j = 0; j < f.size(); j++) {
                    avg+=f.get(i);

                }
                avg=avg/f.size();
                return avg;
            }
            else
                return -1;
        }




    }



