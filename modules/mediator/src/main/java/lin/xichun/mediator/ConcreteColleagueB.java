package lin.xichun.mediator;

/**
 * 具体同事类B
 * Created by Lin.XiChun on 2018/11/23.
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(String cid) {
        super(cid);
    }

    /* 通过中介者发送 */
    @Override
    public void send() {
        this.mediator.toMediatorSend(this.getCid());
    }

    @Override
    public void receive(String fromId) {
        System.out.println("ConcreteColleagueB received and from ColleagueId："+fromId);
    }

}

