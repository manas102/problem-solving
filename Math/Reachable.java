package Math;
/*
 * 2849. Determine if a Cell Is Reachable at a Given Time
 */

 class Reachable{
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xCoordinateDiff = Math.abs(sx-fx);
        int yCoordinateDiff = Math.abs(sy-fy);
       
        // if start and end coordiante are same and t != 1, it is reachable
        if(xCoordinateDiff == 0 && yCoordinateDiff == 0) return t != 1;
            
        // if diff between X Coordinate and Y coordiante are less thant equal to t, it is reachable
        return xCoordinateDiff <= t && yCoordinateDiff <= t;
    }
}