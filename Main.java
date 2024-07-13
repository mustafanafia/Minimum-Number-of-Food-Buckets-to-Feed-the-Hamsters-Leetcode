public class Main {
    public static void main(String[] args) {
        System.out.println(minimumBuckets(".H.H."));
    }

        public static int minimumBuckets(String hamsters) {
            int n = hamsters.length();
            char[] hamstersArr = hamsters.toCharArray();
            int res = 0;

            if(hamsters.equals("H")){
                return -1;
            }
            if(hamsters.equals(".")){
                return 0;
            }

            for(int i=0; i<n; i++){

                if (hamstersArr[i] == 'H') {
                    if (i < n-1 && hamstersArr[i+1] == '.') {
                        i += 2;
                        res ++;
                    } else if (i > 0 && hamstersArr[i-1] == '.') {
                        res ++;
                    } else {
                        return -1;
                    }
                }
            }
            return res;

        }
}