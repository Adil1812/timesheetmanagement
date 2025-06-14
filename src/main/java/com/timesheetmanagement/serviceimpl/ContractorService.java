package com.timesheetmanagement.serviceimpl;

import com.timesheetmanagement.entity.Contractor;
import com.timesheetmanagement.mapper.ContractorMapper;
import com.timesheetmanagement.payload.ContractorDTO;
import com.timesheetmanagement.repository.ContractorRepository;
import com.timesheetmanagement.service.ContractorService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContractorServiceImpl implements ContractorService {

    private final ContractorRepository contractorRepository;
    private final ContractorMapper contractorMapper;

    @Override
    public ContractorDTO registerContractor(ContractorDTO dto) {
        if (contractorRepository.existsByUsername(dto.getUsername())) {
            throw new BusinessException("Username already exists: " + dto.getUsername());
        }

        Contractor contractor = contractorMapper.toEntity(dto);
        Contractor saved = contractorRepository.save(contractor);

        log.info("Contractor registered successfully: {}", saved.getUsername());
        return contractorMapper.toDto(saved);
    }
