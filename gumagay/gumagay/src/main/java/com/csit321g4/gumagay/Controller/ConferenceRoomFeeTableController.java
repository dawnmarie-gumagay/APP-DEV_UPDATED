package com.csit321g4.gumagay.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csit321g4.gumagay.Entity.ConferenceRoomFeeTableEntity;
import com.csit321g4.gumagay.Service.ConferenceRoomFeeTableService;

@RestController
@RequestMapping("/conferenceroomfeetable")
public class ConferenceRoomFeeTableController {

		@Autowired
		ConferenceRoomFeeTableService sserv;

	 
	    @PostMapping("/insertConferenceRoomFeeTable")
	    public ConferenceRoomFeeTableEntity insertConferenceRoom(@RequestBody ConferenceRoomFeeTableEntity conferenceroom) {
	        return sserv.insertConferenceRoom(conferenceroom);
	    }

	    @GetMapping("/getAllConferenceRoomFeeTable")
	    public List<ConferenceRoomFeeTableEntity> getAllConferenceRoom() {
	        return sserv.getAllConferenceRoom();
	    }

	    @PutMapping("/updateConferenceRoomFeeTable")
	    public ConferenceRoomFeeTableEntity updateConferenceRoom(@RequestParam int sid, @RequestBody ConferenceRoomFeeTableEntity newConferenceRoomDetails) {
	    	return sserv.updateConferenceRoom(sid, newConferenceRoomDetails);
	    }

	    @DeleteMapping("/deleteConferenceRoomFeeTable/{sid}")
	    public String deleteTimeSlot(@PathVariable int sid) {
	    	return sserv.deleteConferenceRoom(sid);
	    }
	}
