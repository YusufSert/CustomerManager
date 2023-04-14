package CustomerManager.api.controller;

import CustomerManager.business.abstracts.CustomerService;
import CustomerManager.business.dto.request.CreateCustomerRequest;
import CustomerManager.business.dto.response.GetCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private final CustomerService service;

    @PostMapping
    public void add(@RequestBody CreateCustomerRequest request) {
        service.add(request);
    }

    @GetMapping("/{id}")
    public GetCustomerResponse getById(@PathVariable int id) {
        return service.getById(id);
    }
}
