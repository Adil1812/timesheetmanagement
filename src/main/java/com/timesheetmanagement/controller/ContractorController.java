package com.timesheetmanagement.controller;


import com.timesheetmanagement.payload.ContractorDTO;
import com.timesheetmanagement.service.ContractorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contractor")
@RequiredArgsConstructor
@Slf4j
public class ContractorController {

    private final ContractorService contractorService;

    /**
     * Register a new contractor
     * @param contractorDTO payload with username and password
     * @return saved ContractorDTO
     */
    @PostMapping("/register")
    public ResponseEntity<ContractorDTO> registerContractor(@Valid @RequestBody ContractorDTO contractorDTO) {
        log.info("Received request to register contractor with username: {}", contractorDTO.getUsername());

        ContractorDTO savedContractor = contractorService.registerContractor(contractorDTO);

        log.info("Contractor registered successfully with ID: {}", savedContractor.getContractorId());
        return ResponseEntity.ok(savedContractor);
    }
}