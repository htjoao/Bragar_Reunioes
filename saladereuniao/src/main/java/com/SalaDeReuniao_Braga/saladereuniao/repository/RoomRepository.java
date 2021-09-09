package com.SalaDeReuniao_Braga.saladereuniao.repository;

import com.SalaDeReuniao_Braga.saladereuniao.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
