package dk.sdu.mmmi.cbse.common.data.entityparts;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;

public class ShootingPart implements EntityPart {

    private boolean isShooting;
    
    
    public boolean isShooting() {
        return this.isShooting;
    }
    
    public void setIsShooting(boolean b) {
        this.isShooting = b;
    }
    
    @Override
    public void process(GameData gameData, Entity entity) {
    }
    
}
