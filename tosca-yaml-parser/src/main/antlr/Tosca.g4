/*
    TOSCA Parser Grammar
*/

grammar Tosca;

/*
toscaMap
    :   MAPPING_START keyValuePair+ MAPPING_END
    ;
toscaSequence
    :   SEQUENCE_START value+ SEQUENCE_END
    ;
keyValuePair
    :   SCALAR value
    ;
value
    :   SCALAR
    |   toscaMap
    |   toscaSequence
    ;
*/

dataTypes
    :   DATA_TYPES MAPPING_START dataType+ MAPPING_END
    ;
dataType
    :   SCALAR MAPPING_START (derivedFrom | version | metadata | description)+ MAPPING_END
    ;
derivedFrom
    :   DERIVED_FROM SCALAR
    ;
version
    :   VERSION SCALAR
    ;
description
    :   DESCRIPTION SCALAR
    ;
metadata
    :   METADATA MAPPING_START keyValuePair+ MAPPING_END
    ;

// Lexer rules
DERIVED_FROM:   'derived_from';
DESCRIPTION:    'description';
VERSION:        'version';
METADATA:       'metadata';
DATA_TYPES:     'data_types';


