package Game;

import java.util.Date;

public class HumanLifecycle {
    private IHumanLifecycleObserver observer;

    public HumanLifecycle(IHumanLifecycleObserver observer) {
        this.observer = observer;
    }

    public void startLife() {
        IHumanLifecycleObserver.HumanBornParams bornParams =
                new IHumanLifecycleObserver.HumanBornParams();
        bornParams.birthday = new Date();
        bornParams.weight = 3.123f;
        bornParams.gender = "male";
        IHumanLifecycleObserver.HumanBornParams.name = "SUPERMAN";
        observer.onHumanWasBorn(bornParams);


        IHumanLifecycleObserver.HumanGoKindergarten param =
                new IHumanLifecycleObserver.HumanGoKindergarten();
        param.age = 3;
        param.titleKindergarten = "Kinder+";
        observer.onHumanGoKindergarten(param);


        IHumanLifecycleObserver.HumanGoSchool paramSchool =
                new IHumanLifecycleObserver.HumanGoSchool();
        paramSchool.age = 6;
        paramSchool.titleSchool = "SUPERschool";
        observer.onHumanGoSchool(paramSchool);


        IHumanLifecycleObserver.HumanGoUniversity university =
                new IHumanLifecycleObserver.HumanGoUniversity();
        university.age = 18;
        university.department = " Economic";
        university.titleUniversity = "UKA";
        observer.onHumanGoUniversity(university);


        IHumanLifecycleObserver.HumanCreatFamily creatFamily =
                new IHumanLifecycleObserver.HumanCreatFamily();
        creatFamily.wifeName = "Oji";
        observer.onHumanCreatFamily(creatFamily);


        IHumanLifecycleObserver.HumanMakeChildren children =
                new IHumanLifecycleObserver.HumanMakeChildren();
        children.childrenQnt = 5;
        observer.onHumanMakeChildren(children);


        IHumanLifecycleObserver.HumanDie die =
                new IHumanLifecycleObserver.HumanDie();
        die.dateDie = new Date();
        observer.onHumanDie(die);
    }
}
