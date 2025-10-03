package WebAPIDeveloperAssignment.example.WebAPIDeveloperAssignment.service;

import WebAPIDeveloperAssignment.example.WebAPIDeveloperAssignment.model.CustomerDetails;
import WebAPIDeveloperAssignment.example.WebAPIDeveloperAssignment.model.Reward;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RewardService {

    // Calculating points
    public int calculatePoints  (double amount){
        int points = 0 ;
        if(amount > 100) {
            points += (int)((amount - 100) * 2);
            points += 50;
        }
       else if (amount > 50) {
            points += (int)(amount-50);
        }
        return points;
    }

    public Map<String, Reward> calculateRewards(List<CustomerDetails> customerdetails) {
        Map<String, Reward> result =new HashMap<>();

        for (CustomerDetails cd : customerdetails) {
            String CustomerId = cd.getCustomerID();
            String month =cd.getDate().getMonth().toString();

            int points = calculatePoints(cd.getAmount());

            if (!result.containsKey(CustomerId)) {
                result.put(CustomerId, new Reward());
            }

            Reward reward= result.get(CustomerId);
            reward.addPoints(month, points);
        }

        return result;
    }
}
