package questions.alert_service;

import java.util.Date;
import java.util.UUID;

/**
 * AlgorithmTest
 * Class: AlertService
 * Created by hapo on 2019-02-26.
 * Description:
 *
 * Refactor the AlertService and MapAlertDAO classes:
 *
 * Create a new package-private interface, named AlertDAO, that contains the same methods as MapAlertDAO.
 * MapAlertDAO should implement the AlertDAO interface.
 * AlertService should have a constructor that accepts AlertDAO.
 * The raiseAlert and getAlertTime methods should use the object passed through the constructor.
 *
 * import java.util.Date;
 * import java.util.HashMap;
 * import java.util.Map;
 * import java.util.UUID;
 *
 * class AlertService {
 *     private final MapAlertDAO storage = new MapAlertDAO();
 *
 *     public UUID raiseAlert() {
 *         return this.storage.addAlert(new Date());
 *     }
 *
 *     public Date getAlertTime(UUID id) {
 *         return this.storage.getAlert(id);
 *     }
 * }
 *
 * class MapAlertDAO {
 *     private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();
 *
 *     public UUID addAlert(Date time) {
 *     	UUID id = UUID.randomUUID();
 *         this.alerts.put(id, time);
 *         return id;
 *     }
 *
 *     public Date getAlert(UUID id) {
 *         return this.alerts.get(id);
 *     }
 * }
 *
 */

public class AlertService {

    private AlertDAO alertDAO;

    public AlertService(AlertDAO alertDAO){
        this.alertDAO = alertDAO;
    }

    public UUID raiseAlert(){
        return this.alertDAO.addAlert(new Date());
    }

    public Date getAlertTime(UUID id){
        return this.alertDAO.getAlert(id);
    }

}
