package homework;

import java.io.UnsupportedEncodingException;

public class ConeheadZomine extends Zombine{
    public ConeheadZomine(int row, int column) throws UnsupportedEncodingException {
        super(Constants.getZombinePos(row, column)[0],
              Constants.getZombinePos(row, column)[1],
              Constants.ConeheadZombineSpeed,
              Constants.ConeheadZombineAttackValue,
              ListFiles.listAllFiles(Constants.getImagesPath().getPath() + "Zombies/NormalZombie/ZombieDie"),
              Constants.ZombineDieFPS);

        addStage(new ZombineStage(
            "With Cone Stage",
            ListFiles.listAllFiles(Constants.getImagesPath().getPath() + "Zombies/ConeheadZombie/ConeheadZombie"),
            ListFiles.listAllFiles(Constants.getImagesPath().getPath() + "Zombies/ConeheadZombie/ConeheadZombieAttack"),
            185));
        addStage(new ZombineStage("Without Stage",
            ListFiles.listAllFiles(Constants.getImagesPath().getPath() + "Zombies/NormalZombie/Zombie"),
            ListFiles.listAllFiles(Constants.getImagesPath().getPath() + "Zombies/NormalZombie/ZombieAttack"),
        100));
        addStage(new ZombineStage("Lost Head Stage",
            ListFiles.listAllFiles(Constants.getImagesPath().getPath() + "Zombies/NormalZombie/ZombieLostHead"),
            ListFiles.listAllFiles(Constants.getImagesPath().getPath() + "Zombies/NormalZombie/ZombieLostHeadAttack"),
        45));

        initialTimeline(Constants.ConeheadZombineFPS);
        play();
    }
}


