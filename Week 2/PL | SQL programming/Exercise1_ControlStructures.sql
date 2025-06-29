--Exercise1_ControlStructures.sql


DECLARE
  v_student_name VARCHAR2(50) := 'John';
  v_marks NUMBER := 78;
  v_grade CHAR(1);
  v_result VARCHAR2(10);
BEGIN
  DBMS_OUTPUT.PUT_LINE('--- STUDENT REPORT CARD ---');
  DBMS_OUTPUT.PUT_LINE('Name   : ' || v_student_name);
  DBMS_OUTPUT.PUT_LINE('Marks  : ' || v_marks);

  IF v_marks >= 90 THEN
    v_grade := 'A';
  ELSIF v_marks >= 75 THEN
    v_grade := 'B';
  ELSIF v_marks >= 60 THEN
    v_grade := 'C';
  ELSIF v_marks >= 40 THEN
    v_grade := 'D';
  ELSE
    v_grade := 'F';
  END IF;

  
  CASE 
    WHEN v_grade IN ('A', 'B', 'C', 'D') THEN
      v_result := 'Pass';
    ELSE
      v_result := 'Fail';
  END CASE;

  DBMS_OUTPUT.PUT_LINE('Grade  : ' || v_grade);
  DBMS_OUTPUT.PUT_LINE('Result : ' || v_result);

  DBMS_OUTPUT.PUT_LINE(CHR(10) || '--- Looping through 5 assignments ---');
  
  FOR i IN 1..5 LOOP
    DBMS_OUTPUT.PUT_LINE('Assignment ' || i || ': Completed');
  END LOOP;

  DBMS_OUTPUT.PUT_LINE('------------------------------');

END;