package edu.myschool.chapter6.movie;

public class Room {
    int no; //放映室编号
    Movie movie; //播放电影
    String time; //播放时间
    int[] seats = new int[28]; //座位

    //初始化座位号，座位号为0，代表该座位的票已售出
    public void initialRoom() {
        for (int i = 0; i<seats.length; i++) {
            seats[i] = i + 1;
        }
    }

    //查询座位
    public void showSeats( ) {
        System.out.println(no + "号播放室的座位信息如下:");
        for (int i = 0; i<seats.length; i++) {
            if (seats[i] == 0) {
                System.out.print("无" + "\t");
            } else {
                System.out.print(seats[i] + "\t");
            }
            if ((i + 1) % 7 == 0) {
                System.out.println();
            }
        }
    }

    /**
     * 设置该座位的票已售出
     * @parami座位
     * @return true 该座位的票可以出售，且出售成功。 false 该座位的票已售出，不能再次出售
     */
    public boolean setSaleSeat(int i) {
        boolean result = false;
        if (seats[i - 1] == 0) {
            return false;
        } else {
            seats[i - 1] = 0;
            return true;
        }
    }

    /**
     * 统计剩余的座位数
     * @return 座位数
     */
    public int getSeatsNum() {
        int num = 0;
        for (int seat : seats) {
            if (seat != 0) {
                num++;
            }
        }
        return num;
    }

    //返回放映室信息
    public String toString( ) {
        return no + "\t\t" + movie.name + "\t\t" + time + "\t\t"
                + getSeatsNum();
    }

}


