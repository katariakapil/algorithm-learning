public class DistanceBetween2Stops {
//1184. Distance Between Bus Stops

        public int distanceBetweenBusStops(int[] d, int start, int destination) {


            int startStop = Math.min(start,destination);
            int endStop = Math.max(start,destination );

            int distance = 0;
            int reverseDistance = 0;

            for (int i=0;i<d.length;i++){

                if (i >= startStop && i < endStop) {
                    distance += d[i];
                } else {
                    reverseDistance += d[i];
                }
            }

            return Math.min(distance, reverseDistance);
        }




}
