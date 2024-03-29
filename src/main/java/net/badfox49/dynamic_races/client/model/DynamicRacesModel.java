package net.badfox49.dynamic_races.client.model;

import net.badfox49.dynamic_races.Constants;
import net.minecraft.client.model.geom.ModelPart;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface DynamicRacesModel {
    static final Logger log = LogManager.getLogger(Constants.LOG_NAME);
    public default ModelPart rightHand() {
        return null;
    }
    public default ModelPart leftHand() {
        return null;
    }
}