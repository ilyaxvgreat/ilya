package Game;

import java.util.Date;

public interface IHumanLifecycleObserver {

    void onHumanWasBorn(HumanBornParams param);

    class HumanBornParams {
        static String name;
        Date birthday;
        float weight;
        String gender;
    }

    void onHumanGoKindergarten(HumanGoKindergarten param);

    class HumanGoKindergarten {
        int age;
        String titleKindergarten;
    }

    void onHumanGoSchool(HumanGoSchool param);

    class HumanGoSchool {
        int age;
        String titleSchool;
    }

    void onHumanGoUniversity(HumanGoUniversity param);

    class HumanGoUniversity {
        int age;
        String titleUniversity;
        String department;
    }

    void onHumanCreatFamily(HumanCreatFamily param);

    class HumanCreatFamily {
        String wifeName;
    }

    void onHumanMakeChildren(HumanMakeChildren param);

    class HumanMakeChildren {
        int childrenQnt;
    }

    void onHumanDie(HumanDie param);

    class HumanDie {
        Date dateDie;
    }

}
