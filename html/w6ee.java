import sheffield*.;

public class w6ee{
    public static void main(String[]){
        int[][] coordinates = new int[4][2];

        EasyReader input = new EasyReader();
        EasyWriter screen = new EasyWriter();

        for(int i=0; i<4; i++){
            int x = input.readInt("Enter the x-coordinate: ");
            int y = input.readInt("Enter the y-coordinate: ");

            coordinate[i][0] = x;
            coordinate[i][1] = y;
        }

        //Distance travelled

        int distance = 0;

        for(int i=0; i<3; i++){
            int x1 = coordinate[i][0];
            int y1 = coordinate[i][1];

            int x2 = coordinate[i+1][0];
            int y2 = coordinate[i+1][1];

            distance += Math.hypot((x2-x1),(y2-y1));
        }

        //Distance between first and last point

        int distFL = 0;
        int x1 = coordinate[0][0];
        int y1 = coordinate[0][1];

        int x2 = coordinate[3][0];
        int y2 = coordinate[3][1];

        distFL = Math.hypot((x2-x1),(y2-y1));
    }
}