--Exercise3_StoredProcedures.sql


DECLARE
  v_base NUMBER := 3;
  v_exponent NUMBER := 4;
  v_power NUMBER := 1;
  v_counter NUMBER := 1;
BEGIN
  DBMS_OUTPUT.PUT_LINE('--- Power Calculation ---');
  DBMS_OUTPUT.PUT_LINE('Base: ' || v_base || ', Exponent: ' || v_exponent);

  
  WHILE v_counter <= v_exponent LOOP
    v_power := v_power * v_base;
    v_counter := v_counter + 1;
  END LOOP;

  DBMS_OUTPUT.PUT_LINE('Result: ' || v_power);

  DBMS_OUTPUT.PUT_LINE(CHR(10) || '--- Square Table for Numbers 1 to 5 ---');

  FOR i IN 1..5 LOOP
    DBMS_OUTPUT.PUT_LINE('Square of ' || i || ' is ' || i*i);
  END LOOP;

  DBMS_OUTPUT.PUT_LINE('--------------------------');
END;