package gov.iti.jets.web.mapper;

import gov.iti.jets.web.dto.ActorDto;
import gov.iti.jets.web.persistence.entity.Actor;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ActorMapper {
    Actor toEntity(ActorDto actorDto);
    ActorDto toDto(Actor actor);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Actor partialUpdate(ActorDto actorDto, @MappingTarget Actor actor);
}
