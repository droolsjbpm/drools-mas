/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ${package};
import java.util.List;
import javax.jws.WebService;
import org.drools.mas.ACLMessage;

/**
 *
 * @author salaboy
 */
@WebService
public interface SynchronousDroolsAgentService {
    List<ACLMessage> tell(ACLMessage message);
}
