package questions.alert_service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * AlgorithmTest
 * Class: MapAlertDAO
 * Created by hapo on 2019-02-26.
 * Description:
 */
public class MapAlertDAO implements AlertDAO{

    private final Map<UUID, Date> alerts = new HashMap<>();

    @Override
    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    @Override
    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}
