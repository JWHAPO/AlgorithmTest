package questions.alert_service;

import java.util.Date;
import java.util.UUID;

/**
 * AlgorithmTest
 * Class: AlertDAO
 * Created by hapo on 2019-02-26.
 * Description:
 */
interface AlertDAO{
    UUID addAlert(Date time);
    Date getAlert(UUID id);
}
