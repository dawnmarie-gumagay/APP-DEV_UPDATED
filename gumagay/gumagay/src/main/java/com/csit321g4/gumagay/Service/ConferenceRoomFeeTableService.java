package com.csit321g4.gumagay.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.csit321g4.gumagay.Entity.ConferenceRoomFeeTableEntity;
import com.csit321g4.gumagay.Repository.ConferenceRoomFeeTableRepository;

@Service
public class ConferenceRoomFeeTableService {

		@Autowired
		ConferenceRoomFeeTableRepository crepo;

		public ConferenceRoomFeeTableEntity insertConferenceRoom(ConferenceRoomFeeTableEntity conferenceroom) {
			return crepo.save(conferenceroom);
		}

		@GetMapping("/getAllConferenceRoom")
		public List<ConferenceRoomFeeTableEntity> getAllConferenceRoom(){
			return crepo.findAll();
		}

		 @SuppressWarnings("finally")
			public ConferenceRoomFeeTableEntity updateConferenceRoom(int sid,ConferenceRoomFeeTableEntity newConferenceRoomDetails) {
			 ConferenceRoomFeeTableEntity conferenceroom = new ConferenceRoomFeeTableEntity(sid, sid, sid, sid);
		    	try {

		    		//1.) search the id number of the student that will be updated
		    		conferenceroom = crepo.findById(sid).get();


		    		//2.) update
		    		conferenceroom.setRoomtype(newConferenceRoomDetails.getRoomtype());
		    		conferenceroom.setTimeslot(newConferenceRoomDetails.getTimeslot());
		    		conferenceroom.setFee(newConferenceRoomDetails.getFee());

		    	}catch(NoSuchElementException ex) {
		    		throw new NoSuchElementException("ConferenceRoom " + sid + " does not exist!");

		    	}finally {
		    		return crepo.save(conferenceroom);

		    	}

		    }

		 public String deleteConferenceRoom(int sid) {
		    	String msg = "";

		    	if (crepo.findById(sid) != null) {
		    		crepo.deleteById(sid);
		    		msg = "ConferenceRoom " + sid + " is successfully deleted!";
		    	}else
		    		msg = "ConferenceRoom " + sid + " does not exist.";
		    	return msg;
		    }
	}