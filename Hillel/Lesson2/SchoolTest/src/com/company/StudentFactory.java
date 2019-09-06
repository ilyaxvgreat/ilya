package com.company;

class StudentFactory {

    private int id = 0;
    private int age;
    private String name;

    public Student createNewStudent() {
        int newId = createId();             // TODO ++ id
        int newAge = createAge();           // TODO randomize age [20;25)
        String newName = createName();      // TODO randomize name
        return new Student(newId, newAge, newName);
    }

    private int createId() {
        return this.id++;
    }

    private int createAge() {
        return this.age= ((int) (Math.random() * 5))+20;
    }

    private String createName() {
        String[] arrayNames = new String[11];
        arrayNames[0] = "Dima";
        arrayNames[1] = "Ivan";
        arrayNames[2] = "Toli";
        arrayNames[3] = "John";
        arrayNames[4] = "Jade";
        arrayNames[5] = "Bill";
        arrayNames[6] = "Vasy";
        arrayNames[7] = "Kolj";
        arrayNames[8] = "Comt";
        arrayNames[9] = "Reck";
        arrayNames[10] = "Soom";
        return this.name = arrayNames[(int) (Math.random() * 10)];
    }

}

//[a;b)
//( Math.random() * (b-a) ) + a