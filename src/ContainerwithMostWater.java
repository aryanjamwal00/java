public class ContainerwithMostWater {
    static int maxArea(int[] Height){
        int left = 0;
        int right = Height.length - 1;
        int maxArea = 0;

        while (left < right){
            //width
            int width = right - left;
            //height is limited by shorter line
            int currentheight = Math.min(Height[left], Height[right]);
            //update maxarea with current area
            int currentArea = width * currentheight;
            maxArea = Math.max(currentArea, maxArea);
            //move the pointer pointing to shorter line
            if(Height[left] < Height[right]){
                left++;
            } else{
                right--;
            }
        }
        return maxArea;
    }
    static void main(String[] args) {
        int Height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(Height));
    }
}
