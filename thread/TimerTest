/*
    定时器
 */

public class TimerTest {
    public static void main(String[] args) throws ParseException {
        //创建定时器对象
        Timer timer = new Timer();
        //也可以创建成守护线程的方式
        //Timer timer = new Timer(true);


        //指定定时任务
        //timer.schedule(定时任务，第一次执行时间，间隔多久执行一次);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = simpleDateFormat.parse("2020-12-29 09:40:50");
        timer.schedule(new LogTimerTask(),firstTime,1000*5);
    }
}

//编写一个定时任务类
//假设这是一个记录日志的定时任务
class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        //编写需要执行的任务
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = simpleDateFormat.format(new Date());
        System.out.println(strTime+":成功完成了一次数据备份！");
    }
}
