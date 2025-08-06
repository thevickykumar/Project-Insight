package com.example.Project.Managemt.System.controller;

import com.example.Project.Managemt.System.exception.ChatException;
import com.example.Project.Managemt.System.exception.ProjectException;
import com.example.Project.Managemt.System.exception.UserException;
import com.example.Project.Managemt.System.modal.Chat;
import com.example.Project.Managemt.System.modal.Message;
import com.example.Project.Managemt.System.modal.User;
import com.example.Project.Managemt.System.request.CreateMessageRequest;
import com.example.Project.Managemt.System.service.MessageService;
import com.example.Project.Managemt.System.service.ProjectService;
import com.example.Project.Managemt.System.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectService projectService;




    @PostMapping("/send")
    public ResponseEntity<Message> sendMessage(@RequestBody CreateMessageRequest request)
            throws UserException, ChatException, ProjectException {

        User user = userService.findUserById(request.getSenderId());
        if(user==null) throw new UserException("user Not found with id "+request.getSenderId());
        Chat chats = projectService.getProjectById(request.getProjectId()).getChat();  // This method should throw ChatException if the chat is not found
        if(chats==null) throw new ChatException("Chats not found");
        Message sentMessage = messageService.sendMessage(request.getSenderId(), request.getProjectId(), request.getContent());
        return ResponseEntity.ok(sentMessage);
    }

    @GetMapping("/chat/{projectId}")
    public ResponseEntity<List<Message>> getMessagesByChatId(@PathVariable Long projectId)
            throws ProjectException, ChatException {
        List<Message> messages = messageService.getMessagesByProjectId(projectId);
        return ResponseEntity.ok(messages);
    }
}

