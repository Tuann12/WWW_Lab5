package vn.edu.iuh.fit.lab05.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.lab05.backend.services.CandidateServices;

@RestController("/api/vi")
public class CandidateResources {
    @Autowired
    private CandidateServices services;
}
