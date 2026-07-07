defmodule Grades.Calculator do
  @weights %{homework: 0.20, labs: 0.10, midterm: 0.25, final: 0.45}

  # Percent grade as an integer
  def percentage_grade(%{homework: homework, labs: labs, midterm: midterm, final: final}) do
    raw_val =
      average(homework) * @weights.homework +
      average(labs) * @weights.labs +
      to_number(midterm) * @weights.midterm +
      to_number(final) * @weights.final

    round(raw_val)
  end

  # Letter grade as a string
  def letter_grade(grades) do
    grades
    |> percentage_grade()
    |> percentage_to_letter()
  end

  # Numeric grade as an integer
  def numeric_grade(grades) do
    grades
    |> letter_grade()
    |> letter_to_numeric()
  end

  # Helper functions

  defp average(scores) do
    valid_scores =
      scores
      |> Enum.map(&to_number/1)
      |> Enum.reject(&is_nil/1)

      # Prevent division by 0
      case valid_scores do
        [] -> 0.0
        _ -> Enum.sum(valid_scores) / length(valid_scores)
      end
  end

  defp to_number(""), do: nil
  defp to_number(value) when is_binary(value) do
    # If number matched, return number portion, else nil if error
    case Float.parse(value) do
      {num, _rest} -> num
      :error -> nil
    end
  end

  # Mapping of % to letter
  defp percentage_to_letter(pct) when pct >= 90, do: "A+"
  defp percentage_to_letter(pct) when pct >= 85, do: "A"
  defp percentage_to_letter(pct) when pct >= 80, do: "A-"
  defp percentage_to_letter(pct) when pct >= 75, do: "B+"
  defp percentage_to_letter(pct) when pct >= 70, do: "B"
  defp percentage_to_letter(pct) when pct >= 65, do: "C+"
  defp percentage_to_letter(pct) when pct >= 60, do: "C"
  defp percentage_to_letter(pct) when pct >= 55, do: "D+"
  defp percentage_to_letter(pct) when pct >= 50, do: "D"
  defp percentage_to_letter(pct) when pct >= 40, do: "E"
  defp percentage_to_letter(_pct), do: "F"

  # Mapping of letter to numeric
  defp letter_to_numeric("A+"), do: 10
  defp letter_to_numeric("A"), do: 9
  defp letter_to_numeric("A-"), do: 8
  defp letter_to_numeric("B+"), do: 7
  defp letter_to_numeric("B"), do: 6
  defp letter_to_numeric("C+"), do: 5
  defp letter_to_numeric("C"), do: 4
  defp letter_to_numeric("D+"), do: 3
  defp letter_to_numeric("D"), do: 2
  defp letter_to_numeric("E"), do: 1
  defp letter_to_numeric("F"), do: 0
end
