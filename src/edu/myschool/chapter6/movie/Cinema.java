package edu.myschool.chapter6.movie;

import java.util.Scanner;

public class Cinema {
    Movie[] movies; //电影
    Room[] rooms; //放映室

    Scanner input = new Scanner(System.in);

    /**
     * 初始化电影数组和播放室数组的大小
     */
    public void initial() {
        movies = new Movie[6]; //创建电影的数组
        rooms = new Room[3]; //创建放映室数组
        //初始化放映室的数组
        for (int i = 0; i < rooms.length; i++) {
            Room room = new Room();
            room.no = (i + 1);
            room.initialRoom();
            rooms[i] = room;
        }
    }

    /**
     * 电影入院，添加新电影
     *
     * @return true or false，影片添加成功返回true，否则返回false
     */
    public boolean addMovie() {
        boolean result = false; //添加是否成功的状态
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] == null) {
                Movie movie = new Movie();//创建电影
                System.out.print("输入电影的名称:");
                movie.name = input.next();
                System.out.print("输入电影的类型:");
                movie.type = input.next();
                System.out.print("输入电影的主演:");
                movie.actor = input.next();
                System.out.print("输入电影的价格:");
                movie.price = input.nextDouble();
                movies[i] = movie; //将电影添加至电影数组中
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * 查询，输出所有电影信息
     */
    public void showAllMovie() {
        System.out.println("电影名称\t\t电影类型\t\t电影主演\t\t电影价格");
        for (Movie movie : movies) {
            if (movie != null) {
                System.out.println(movie);
            }
        }
    }


    /**
     * 根据影片名称查找电影
     *
     * @param name 影片名称
     * @return 电影
     */
    public Movie findMovie(String name) {
        Movie movie = null;
        //遍历电影数组
        for (int i = 0; i < movies.length; i++) {
            if (movies[i] != null) {
                //比较电影名称
                if (name.equals(movies[i].name)) {
                    movie = movies[i]; //获取找到的电影
                    break;
                }
            }

        }
        return movie; //返回找到的电影
    }

    /**
     * 设置电影播放的地点与时间
     *
     * @return true or false，如果设置成功返回true，设置失败则返回false
     */
    public boolean setMovieRoom() {
        System.out.println("放映室设置播放影片");
        System.out.print("请输入放映室编号：");
        int roomNO = input.nextInt();
        System.out.print("请输入放映影片的名称：");
        String movieName = input.next();
        System.out.print("请输入影片放映的时间：");
        String playTime = input.next();
        boolean result = false; //设置成功的状态
        Room room = rooms[roomNO - 1]; //获取放映室
        if (room.movie == null) { //如果放映室没有电影
            room.movie = findMovie(movieName); //设置放映室播放的电影
            room.time = playTime;
            result = true; //设置成功
        } else {
            System.out.println("该放映室已有电影播放!");
            result = false; //设置失败
        }
        return result;
    }

    /**
     * 显示电影院的放映室的信息
     */
    public void showRoomsInfo() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].movie != null) {
                System.out.println(rooms[i]); //输出放映室的信息
            }
        }
    }

    /**
     * 销售电影票
     *
     * @return true or false ，销售成功返回true，否则返回false
     */
    public boolean saleTicket() {
        boolean result = false;
        System.out.println("电影院放映信息如下：");
        showRoomsInfo(); //显示播放室信息
        System.out.println("请输入要观看的放映室编号：");
        int roomNO = input.nextInt();
        if (rooms[roomNO - 1].movie != null && roomNO <= rooms.length) { //该电影存在
            rooms[roomNO - 1].showSeats();
            System.out.println("请选择座位:");
            int seatNO = input.nextInt();
            //设置该座位状态为已购买
            boolean res = rooms[roomNO - 1].setSaleSeat(seatNO);
            //打印电影票据
            if (res) {
                System.out.println("购票成功！");
                System.out.println("打印小票，信息如下：");
                System.out.println("-----------------------------");
                System.out.println("电影:" + rooms[roomNO - 1].movie.name);
                System.out.println("价格:" + rooms[roomNO - 1].movie.price);
                System.out.println("播放室编号" + roomNO + "\t座位号:" + seatNO);
                System.out.println("播放时间:" + rooms[roomNO - 1].time);
                result = true;
            } else {
                System.out.println("购票失败！");
            }
        }
        return result;
    }

}

