package ir.ansarit;

import ir.ansarit.entity.EmailDTO;
import ir.ansarit.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Vector;

@RestController
@EnableJpaRepositories
@ComponentScan("ir.ansarit")
public class EmailController {

    @Autowired
    private EmailRepository emailRepository;
    @Autowired
    private UserRepository repository;

    /*@GetMapping("get")
    public Vector getList(@RequestBody User user){
        Vector v = new Vector();
        User sampleUser = repository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (sampleUser.getPassword().equals(user.getPassword()) && sampleUser.getUsername().equals(user.getUsername())) {
            v.add(sampleUser);
            v.add(emailRepository.findInboxList());
            v.add(emailRepository.findOutboxList());
            v.add(emailRepository.findDraftList());
            return v;
        }else {
            throw new NullPointerException();
        }
    }*/

    @GetMapping("get")
    public EmailDTO getList(@RequestBody User user) {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setUsername(user.getUsername());
        emailDTO.setPassword(user.getPassword());
        emailDTO.setDraftList(emailRepository.findDraftList());
        emailDTO.setInboxList(emailRepository.findInboxList());
        emailDTO.setOutboxList(emailRepository.findOutboxList());
        return emailDTO;

    }
}
