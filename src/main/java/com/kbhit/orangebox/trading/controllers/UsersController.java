package com.kbhit.orangebox.trading.controllers;

import com.kbhit.orangebox.trading.controllers.dto.UserDto;
import com.kbhit.orangebox.trading.domain.repository.UserRepository;
import com.kbhit.orangebox.trading.security.AuthoritiesConstants;
import io.swagger.annotations.ApiOperation;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Mapper mapper;

    @ApiOperation(value = "getSingleTrade")
    @RequestMapping(value = "/trades/{userId}", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @Secured(AuthoritiesConstants.USER)
    public ResponseEntity<UserDto> getTrade(@PathVariable String userId) {
        return null;
    }

}
