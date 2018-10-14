public class Main {

    public static void main(String[] args) {
        WordFunnel funnel = new WordFunnel();

        System.out.println(funnel.funnel("leave", "eave"));
        System.out.println(funnel.funnel("reset", "rest"));
        System.out.println(funnel.funnel("dragoon", "dragon"));
        System.out.println(funnel.funnel("eave", "leave"));
        System.out.println(funnel.funnel("sleet", "lets"));
        System.out.println(funnel.funnel("skiff", "ski"));
    }
}
