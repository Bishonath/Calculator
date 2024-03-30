/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Dell
 */
public class CalculatorFunctions {

    private double _variable1;
    private double _variable2;
    private double _result;
    private String _operator;

    public CalculatorFunctions() {
        clear();
    }

    public void clear() {
        _variable1 = 0;
        _variable2 = 0;
        _operator = "";

    }

    public void setOperator(String operator) {

        _operator = operator;

    }

    public void setVar1(String operand) {
        try {
            _variable1 = Double.parseDouble(operand);
        } catch (NumberFormatException ex) {
            _variable1 = 0;
        }
    }

    public double getVar1() {
        return _variable1;
    }

    public void setVar2(String operand) {
        try {
            _variable2 = Double.parseDouble(operand);
        } catch (NumberFormatException ex) {
            _variable2 = 0;
        }
    }

    public double getVar2() {
        return _variable2;
    }

    private double performMath() {
        if (_operator == "+") {
            _result = _variable1 + _variable2;

        } else if (_operator == "*") {
            _result = _variable1 * _variable2;

        } else if (_operator == "/") {
            _result = _variable1 / _variable2;

        } else if (_operator == "-") {
            _result = _variable1 - _variable2;
        } else {
            _result = 0;
        }
        return _result;
    }

    public double getResult() {
        performMath();
        return _result;
    }
}
