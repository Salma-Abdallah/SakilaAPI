package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.persistence.entity.Actor;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-20T13:26:04+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
public class ActorMapperImpl implements ActorMapper {

    @Override
    public Actor toEntity(ActorDto actorDto) {
        if ( actorDto == null ) {
            return null;
        }

        Actor actor = new Actor();

        actor.setId( actorDto.getId() );
        actor.setFirstName( actorDto.getFirstName() );
        actor.setLastName( actorDto.getLastName() );
        actor.setLastUpdate( actorDto.getLastUpdate() );

        return actor;
    }

    @Override
    public ActorDto toDto(Actor actor) {
        if ( actor == null ) {
            return null;
        }

        ActorDto actorDto = new ActorDto();

        actorDto.setId( actor.getId() );
        actorDto.setFirstName( actor.getFirstName() );
        actorDto.setLastName( actor.getLastName() );
        actorDto.setLastUpdate( actor.getLastUpdate() );

        return actorDto;
    }

    @Override
    public Actor partialUpdate(ActorDto actorDto, Actor actor) {
        if ( actorDto == null ) {
            return actor;
        }

        if ( actorDto.getId() != null ) {
            actor.setId( actorDto.getId() );
        }
        if ( actorDto.getFirstName() != null ) {
            actor.setFirstName( actorDto.getFirstName() );
        }
        if ( actorDto.getLastName() != null ) {
            actor.setLastName( actorDto.getLastName() );
        }
        if ( actorDto.getLastUpdate() != null ) {
            actor.setLastUpdate( actorDto.getLastUpdate() );
        }

        return actor;
    }
}
