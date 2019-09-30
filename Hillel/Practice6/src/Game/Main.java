package Game;

public class Main {

    public static void main(String[] args) {
        IHumanLifecycleObserver observer = new LogginHumanLifecycleObserver();

        HumanLifecycle lifecycle = new HumanLifecycle(observer);
        lifecycle.startLife();
    }

    private static class LogginHumanLifecycleObserver implements IHumanLifecycleObserver {

        @Override
        public void onHumanWasBorn(HumanBornParams param) {
            System.out.println(String.format(
                    "Child was born in %s with weight %.3f and gender %s.Name is %s",
                    param.birthday, param.weight, param.gender, HumanBornParams.name
            ));
        }

        @Override
        public void onHumanGoKindergarten(HumanGoKindergarten param) {
            System.out.println(String.format(
                    HumanBornParams.name + " go to kindergarten %s. His age is %s. ",
                    param.titleKindergarten, param.age

            ));
        }

        @Override
        public void onHumanGoSchool(HumanGoSchool param) {
            System.out.println(String.format(
                    HumanBornParams.name + " go to school %s,at the %s",
                    param.titleSchool, param.age
            ));
        }

        @Override
        public void onHumanGoUniversity(HumanGoUniversity param) {
            System.out.println(String.format(
                    "In %s, go to %s in %s department",
                    param.age, param.titleUniversity, param.department
            ));
        }

        @Override
        public void onHumanCreatFamily(HumanCreatFamily param) {
            System.out.println(String.format(
                    "Wedding on %s", param.wifeName
            ));
        }

        @Override
        public void onHumanMakeChildren(HumanMakeChildren param) {
            System.out.println(String.format(
                    "Was born %s children(s)", param.childrenQnt
            ));
        }

        @Override
        public void onHumanDie(HumanDie param) {
            System.out.println(String.format(
                    "R.I.P %s", param.dateDie
            ));
        }
    }
}
