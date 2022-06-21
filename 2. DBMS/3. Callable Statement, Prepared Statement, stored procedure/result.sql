create or replace procedure "INSERTR" (id IN NUMBER, name IN VARCHAR2)  
is  
begin  
insert into users values(id,name);  
end;
/  