package lin.xichun.command;

/**
 * 调用者
 * Created by Lin.XiChun on 2018/11/19.
 */
public class Invoker {
    private Command command;

    // 构造注入
    public Invoker(Command command) {
        this.command = command;
    }

    // 设值注入
    public void setCommand(Command command) {
        this.command = command;
    }

    // 业务方法，用于调用命令类的execute()方法
    public void call() {
        command.execute();
    }

}
