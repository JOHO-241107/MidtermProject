public class GameMaster {
    public static void main(String[] args) {
        Hero abel = new Hero("アベル", 100, "銅の剣");
        Slime slm = new Slime("スライムA", 30);
        System.out.println("冒険が始まる...!");
        abel.showStats();
        slm.showStats();
        System.out.println("戦闘開始！");
        abel.attack(slm);
        slm.showStats();
        slm.attack(abel);
        abel.showStats();
        abel.heal();
        abel.showStats();
        abel.attack(slm);
        abel.attack(slm);
        abel.attack(slm);
        System.out.println("--- 戦闘終了 ---");
        System.out.println("最終ステータス:")
        abel.showStats();
        slm.showStats();
        System.out.println(abel.name + "は生きている： " + abel.isAlive());
        System.out.println(slm.name + "は生きている： " + slm.isAlive());
        System.out.println("--- 参照の確認 ---");
        Character partyMenber = abel;
        partyMenber.hp -= 50;
        System.out.println("partyMenber経由でHPを減らした後：");
        abel.showStats();
    }
}
