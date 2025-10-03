package WebAPIDeveloperAssignment.example.WebAPIDeveloperAssignment.controller;

import WebAPIDeveloperAssignment.example.WebAPIDeveloperAssignment.model.CustomerDetails;
import WebAPIDeveloperAssignment.example.WebAPIDeveloperAssignment.model.Reward;
import WebAPIDeveloperAssignment.example.WebAPIDeveloperAssignment.service.RewardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/rewards")
public class RewardController {
    private final RewardService rewardService;

    public RewardController(RewardService rewardService) {
        this.rewardService = rewardService;
    }

    @GetMapping
    public Map<String, Reward> getRewards(){
        List<CustomerDetails> cd = Arrays.asList(
                new CustomerDetails("vaishnavi", 120, LocalDate.of(2025, 6, 15)),
                new CustomerDetails("Prabhu", 75, LocalDate.of(2025, 7, 10)),
                new CustomerDetails("Vaishnavi", 200, LocalDate.of(2025, 8, 5)),
                new CustomerDetails("Mohnish", 60, LocalDate.of(2025, 6, 20)),
                new CustomerDetails("Mohnish", 110, LocalDate.of(2025, 7, 12)),
                new CustomerDetails("God", 45, LocalDate.of(2025, 8, 25))
        );

        return rewardService.calculateRewards(cd);


    }
}
