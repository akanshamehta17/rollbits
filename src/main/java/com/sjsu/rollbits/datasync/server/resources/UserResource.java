package com.sjsu.rollbits.datasync.server.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import routing.Pipe;

public class UserResource  implements RouteResource {
    protected static Logger logger = LoggerFactory.getLogger("user");

    @Override
    public Pipe.Route.Path getPath() {
        return Pipe.Route.Path.USER;
    }

    @Override
    public String process(Pipe.Route msg) {


        Pipe.actionType option= msg.getUser().getAction();

        switch(option){
            case GET:



                break;




            case PUT:
                Pipe.User user= msg.getUser();
                System.out.println(user.getUname());

                break;

        }


        return "success";
    }

}

