defmodule Grades.Calculator do
  def percentage_grade(%{final: final, homework: homework, labs: labs, midterm: midterm}) do
    0
  end

  def letter_grade(%{final: final, homework: homework, labs: labs, midterm: midterm}) do
    "F"
  end

  def numeric_grade(%{final: final, homework: homework, labs: labs, midterm: midterm}) do
    0.0
  end
end
