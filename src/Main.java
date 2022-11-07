public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat -1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalBoxerWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Общий вес боксеров " + totalBoxerWeight + " кг.");
        System.out.println("Разница в весе боксеров " + weightDifference + " кг.");
        weightDifference = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг.");
        var hoursWork = 640;
        var staffTime = 8;
        var numberOfStaff = hoursWork / staffTime;
        System.out.println("Всего работников в компании – " + numberOfStaff + " человек");
        numberOfStaff += 94;
        hoursWork = numberOfStaff * staffTime;
        System.out.println("Если в компании работает " + numberOfStaff + " человек, то всего " + hoursWork + " часов работы может быть поделено между сотрудниками");
    }
}